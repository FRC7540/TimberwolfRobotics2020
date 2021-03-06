/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auto_commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class PositionTwo extends SequentialCommandGroup {
  /**
   * Creates a new AutoMid.
   */
  public PositionTwo() {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    addCommands(new AutoShoot().withTimeout(Robot.autonomousSubsystem.shootRun),
        new AutoBackward().withTimeout(Robot.autonomousSubsystem.backwardRun));
    new AutoTurnAround().withTimeout(Robot.autonomousSubsystem.turnAround);
  }
}
