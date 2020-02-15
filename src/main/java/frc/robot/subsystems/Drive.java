/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.networktables.NetworkTableInstance;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

/**
* Add your docs here.
*/
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static final XboxController controller1 = new XboxController(RobotMap.controller1);
    private static final PWMVictorSPX motor1 = new PWMVictorSPX(RobotMap.leftMotors[0]);
    private static final PWMVictorSPX motor2 = new PWMVictorSPX(RobotMap.leftMotors[1]);
    private static final PWMVictorSPX motor3 = new PWMVictorSPX(RobotMap.rightMotors[0]);
    private static final PWMVictorSPX motor4 = new PWMVictorSPX(RobotMap.rightMotors[1]);
    SpeedControllerGroup leftmotors = new SpeedControllerGroup(motor1, motor2);
    SpeedControllerGroup rightmotors = new SpeedControllerGroup(motor3, motor4);
    DifferentialDrive maindrive = new DifferentialDrive(leftmotors, rightmotors);

    NetworkTableInstance ntinst = NetworkTableInstance.getDefault();

@Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveCommand());
  }
   public void driveSystem() {
    double analogLY = controller1.getY(Hand.kLeft);
    double analogLX = controller1.getX(Hand.kLeft);
    maindrive.arcadeDrive(analogLY, analogLX, true);
  }
  public void visionTarget() {
    double midX = ntinst.getTable("contourPoints").getEntry("midPointX").getDouble(-1);
    double midY = ntinst.getTable("contourPoints").getEntry("midPointY").getDouble(-1);
    boolean resultsCheck = ntinst.getTable("contourPoints").getEntry("resultsCheck").getBoolean(false);

    if (resultsCheck == true) {
      if (midX < -.1) {
        maindrive.arcadeDrive(0, .5);
        if (midX >= -.1) {
          maindrive.stopMotor();
          return;
        }
        return;
      }
      if (midX > .1) {
        maindrive.arcadeDrive(0, -.5);
        if (midX <= .1) {
          maindrive.stopMotor();
          return;
        }
        return;
      }

    }
  }
}
