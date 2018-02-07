package org.usfirst.frc.team3786.robot.commands;

import org.usfirst.frc.team3786.robot.subsystems.TowerSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class TowerStopCommand extends Command{
	
	public TowerStopCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(TowerSubsystem.getInstance());
	}

	
	// Called just before this Command runs the first time
		@Override
		protected void initialize() {
			TowerSubsystem.getInstance().setBrakeMode(true);
			TowerSubsystem.getInstance().setLiftSpeed(0.0);
		}

		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute() {
		}

		// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished() {
			return false;
		}

		// Called once after isFinished returns true
		@Override
		protected void end() {
		}

		// Called when another command which requires one or more of the same
		// subsystems is scheduled to run
		@Override
		protected void interrupted() {
		}
	}
		


