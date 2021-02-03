// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/** Add your docs here. */
public class OI {

    Joystick pilot;
    JoystickButton a,b,x,y;

    public OI () {
        pilot = new Joystick(0);
        a = new JoystickButton(pilot, 0);
        b = new JoystickButton(pilot, 1);
        x = new JoystickButton(pilot, 2);
        y = new JoystickButton(pilot, 3);

    }

    public void configureButtonBindings(){
        /*button configuration
        */
        //a.whenPressed(new AbsorbPowerCells())
        // getX getY
    }

    public double getLeftAxisX(){
        return pilot.getRawAxis(0);
        // xbox = 0, ps4 = 0
    }
    
    public double getLeftAxisY(){
        return pilot.getRawAxis(1);
        // xbox = 1, ps4 = 1
    }
    
    
}
