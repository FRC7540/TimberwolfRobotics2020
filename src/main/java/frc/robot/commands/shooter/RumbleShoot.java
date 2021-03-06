/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.auto_commands.AutoShoot;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class RumbleShoot extends ParallelCommandGroup {
  /**
   * Creates a new RumbleShoot.
   */
  public RumbleShoot() {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());super();
    addCommands(new AutoShoot(), new RumbleRun());
  }

  @Override
  public void end(boolean interrupted) {
    super.end(interrupted);
    Robot.rumbleSubsystem.rumbleStop();
  }
}
