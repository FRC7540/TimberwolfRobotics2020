/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.util.Color;
import frc.robot.Robot;

public class PrintColorv2 extends InstantCommand {

  Color detectedColor;

  public PrintColorv2() {
    super();
    requires(Robot.colorSensorSubsystem);
  }
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {    
      /**
   * A Rev Color Sensor V3 object is constructed with an I2C port as a 
   * parameter. The device will be automatically initialized with default 
   * parameters.
   */
 // private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
    /**
     * The method GetColor() returns a normalized color value from the sensor and can be
     * useful if outputting the color to an RGB LED or similar. To
     * read the raw color, use GetRawColor().
     * 
     * The color sensor works best when within a few inches from an object in
     * well lit conditions (the built in LED is a big help here!). The farther
     * an object is the more light from the surroundings will bleed into the 
     * measurements and make it difficult to accurately determine its color.
     */
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    detectedColor = Robot.colorSensorSubsystem.getColor();
    System.out.println(detectedColor);
    //Robot.driveSubsystem.driveSystem(); becomes the future subsystem.

  }
}
