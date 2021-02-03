// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {

  Talon leftRearMotor, leftMiddleMotor, leftFrontMotor,
        rightRearMotor, rightMiddleMotor, rightFrontMotor;

  /** Creates a new DriveTrain. */
  public DriveTrain() {

    leftRearMotor = new Talon(RobotMap.LEFT_REAR_MOTOR_PORT);
    leftMiddleMotor = new Talon(RobotMap.LEFT_MIDDLE_MOTOR_PORT);
    leftFrontMotor = new Talon(RobotMap.LEFT_FRONT_MOTOR_PORT);

    rightRearMotor = new Talon(RobotMap.RIGHT_REAR_MOTOR_PORT);
    rightMiddleMotor = new Talon(RobotMap.RIGHT_MIDDLE_MOTOR_PORT);
    rightFrontMotor = new Talon(RobotMap.RIGHT_FRONT_MOTOR_PORT);

  }

  public void drive(double x, double y) {
    double leftSpeed = x - y;
    double rightSpeed = -x - y;

    leftRearMotor.set(leftSpeed);
    leftMiddleMotor.set(leftSpeed);
    leftFrontMotor.set(leftSpeed);

    rightRearMotor.set(rightSpeed);
    rightMiddleMotor.set(rightSpeed);
    rightFrontMotor.set(rightSpeed);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
