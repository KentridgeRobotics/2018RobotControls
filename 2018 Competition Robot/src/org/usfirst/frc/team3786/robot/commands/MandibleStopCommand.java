package org.usfirst.frc.team3786.robot.commands;

import org.usfirst.frc.team3786.robot.subsystems.MandibleSubsystem;

import edu.wpi.first.wpilibj.command.Command;

	public class MandibleStopCommand extends Command{

		public MandibleStopCommand() {
			// Use requires() here to declare subsystem dependencies
			requires(MandibleSubsystem.getInstance());
		}

		// Called just before this Command runs the first time
		@Override
		protected void initialize() {
			MandibleSubsystem.getInstance().setBrakeMode(true);
			MandibleSubsystem.getInstance().setTwoMotorSpeeds(0);
		}

		
		// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished() {
			return false;
		}

	}
		

