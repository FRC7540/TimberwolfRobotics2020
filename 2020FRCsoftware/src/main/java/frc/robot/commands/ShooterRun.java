/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.XboxController;

import frc.robot.Robot;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;;

public class ShooterRun extends Command {

  private static final XboxController controller1 = new XboxController(RobotMap.controller1);
  private static final WPI_VictorSPX shooterMotor = new WPI_VictorSPX(RobotMap.shooterMotor);

  public ShooterRun() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.shooterSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.shooterSubsystem.shoot();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double speed = shooterMotor.get();
    System.out.println(speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
