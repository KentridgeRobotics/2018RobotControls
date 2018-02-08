package org.usfirst.frc.team3786.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class SpeedLimitCommand extends Command {

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		MecanumDriveCommand.instance.toggleSpeedLimit();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return true;
	}

}
