/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
//From 5839

import edu.wpi.first.wpilibj.Compressor;
//import frc.robot.RobotMap;
//import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj.GenericHID;



public class Pneumatics extends Subsystem {
    private static final Compressor comp = new Compressor(0);
    

    private DoubleSolenoid feederSolenoid;
    //From 5839
    
    
    public void start(){
        Pneumatics.comp.start();
        Pneumatics.comp.setClosedLoopControl(true);
        
    }
//runs compressor


    public void feederDeployment(){
        feederSolenoid.set(DoubleSolenoid.Value.kForward);
    }
//moves pistons forward
    
    public void feederRetract(){
        feederSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
//moves pistons backward

    public void off(){
        feederSolenoid.set(Value.kOff);
    }
//Stops pistons

    public void ArmsRaise(){
        feederSolenoid.set(DoubleSolenoid.Value.kForward);
    }
//Raises arms

    public void ArmsRetract(){
        feederSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
// lowers arms

    @Override
    protected void initDefaultCommand() {

    }
//Necessary override


}