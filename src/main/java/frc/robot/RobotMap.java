package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SolenoidBase;

public class RobotMap {
    
    // Drive
    public static final int[] leftMotors = {0, 1};
    public static final int[] rightMotors = {2, 3};
    
    //Controllers
    public static final int controller1 = 0;
    public static final int controller2 = 1;

    //shooter
    public static final int shooterMotor = 4;
    
    //Feeder
    public static final int FeederMotor = 5;

    //Pneumatics
    public static final int hammerPneumaticsForward = 0;
    public static final int hammerPneumaticsBackward = 1;
    public static final int armsPneumaticsForward = 2;
    public static final int armsPneumaticsBackward = 3;
    
    //Hopper
	public static final int HopperMotor = 6;

    //public static Solenoid hammerPneumaticsForward = new Solenoid(1);
    //public static Solenoid hammerPneumaticsBackward = new Solenoid(2);
    //public static Solenoid armsPneumaticsForward = new Solenoid(3);
    //public static Solenoid armsPneumaticsBackward = new Solenoid(4);

}