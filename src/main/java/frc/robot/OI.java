/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.commands.*;

/**
 * Add your docs here.
 */
public class OI {

    public OI () {
		//test bindings
		driverButtonA.whenPressed(new FeederStart());
		driverButtonX.whenPressed(new FeederStop());
		//driverButtonLeftBumper.whenPressed(new FeederSlow());
		//driverButtonRightBumper.whenPressed(new FeederSpeed());

		// operatorButtonA.whenPressed(new ShooterRun());
		// operatorButtonX.whenPressed(new ShooterStop());

		//competition bindings
		// driverButtonLeftBumper.whenPressed(new FeederContract());
		// driverButtonRightBumper.whenPressed(new FeederExtend());
		// driverButtonStart.whenPressed(new StartCompressor());
		// driverButtonBack.whenPressed(new StopCompressor());
		// driverButtonA.whenPressed(new feederSolenoidOff());

		operatorButtonLeftBumper.whenPressed(new ShooterSlow());
		operatorButtonRightBumper.whenPressed(new ShooterSpeed());
		operatorButtonBack.whileHeld(new AlignRobot());
    }

    private static final int LEFT_HORIZ_AXIS = 0;
	private static final int LEFT_VERT_AXIS = 1;
	private static final int RIGHT_HORIZ_AXIS = 4;
	private static final int RIGHT_VERT_AXIS = 5;
	private static final int LEFT_Z_AXIS = 3;
	private static final int RIGHT_Z_AXIS = 2;

		//competition bindings (possible)
		//driverButtonLeftBumper.whenPressed(new feederOut());
		//driverButtonRightBumper.whenPressed(new feederIn());
		//driverButtonA.whenPressed(new runFeeder());
		//driverButtonB.whenPressed(new targetAlign());
		
		//operatorButtonA.whenPressed(new selectGreen());
		//operatorButtonB.whenPressed(new selectRed());
		//operatorButtonX.whenPressed(new selectBlue());
		//operatorButtonY.whenPressed(new selectYellow());
		//operatorButtonStart.whenPressed(new panelSpin());
		//operatorButtonBack.whenPressed(new colorSensorUp());
		//operatorButtonLeftBumper.whenPressed(new runHopper());
		//operatorButtonRightBumper.whileHeld(new Shoot());

	// driver controller setup
	private Joystick driverController = new Joystick(RobotMap.driverController);
	private Button driverButtonA = new JoystickButton(driverController, 1);
	private Button driverButtonB = new JoystickButton(driverController, 2);
	private Button driverButtonX = new JoystickButton(driverController, 3);
	private Button driverButtonY = new JoystickButton(driverController, 4);
	private Button driverButtonLeftBumper = new JoystickButton(driverController, 5);
	private Button driverButtonRightBumper = new JoystickButton(driverController, 6);
	private Button driverButtonBack = new JoystickButton(driverController, 7);
	private Button driverButtonStart = new JoystickButton(driverController, 8);
	private Button driverButtonLeftAxisPress = new JoystickButton(driverController, 9);
	private Button driverButtonRightAxisPress = new JoystickButton(driverController, 10);
	
	// Operator controller setup
	private Joystick operatorController = new Joystick(RobotMap.operatorController);
	private Button operatorButtonA = new JoystickButton(operatorController, 1);
	private Button operatorButtonB = new JoystickButton(operatorController, 2);
	private Button operatorButtonX = new JoystickButton(operatorController, 3);
	private Button operatorButtonY = new JoystickButton(operatorController, 4);
	private Button operatorButtonLeftBumper = new JoystickButton(operatorController, 5);
	private Button operatorButtonRightBumper = new JoystickButton(operatorController, 6);
	private Button operatorButtonBack = new JoystickButton(operatorController, 7);
	private Button operatorButtonStart = new JoystickButton(operatorController, 8);
	private Button operatorButtonLeftAxisPress = new JoystickButton(operatorController, 9);
	private Button operatorButtonRightAxisPress = new JoystickButton(operatorController, 10);
}
