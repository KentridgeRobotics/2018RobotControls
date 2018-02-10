package org.usfirst.frc.team3786.robot.subsystems;

import org.usfirst.frc.team3786.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LiftSubsystem extends Subsystem {

	private static LiftSubsystem instance;

	public static LiftSubsystem getInstance() {
		if (instance == null)
			instance = new LiftSubsystem();
		return instance;
	}

	private WPI_TalonSRX motor;

	public LiftSubsystem() {
		motor = new WPI_TalonSRX(RobotMap.liftMotor);
	}

	public void setMotorSpeed(double speed) {
		motor.set(speed);
	}

	public void setBrakeMode(boolean isBraking) {
		NeutralMode mode;
		if (isBraking)
			mode = NeutralMode.Brake;
		else
			mode = NeutralMode.Coast;
		motor.setNeutralMode(mode);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}

}
