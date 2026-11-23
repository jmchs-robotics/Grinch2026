package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.shooter.Extake;

public class ShooterCommands extends Command {

  private final Extake m_Extake;

  public ShooterCommands(Extake extakeWheels) {

    m_Extake = extakeWheels;
    addRequirements(m_Extake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_Extake.setWheelMotors(1);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public void end(boolean interrupted) {
    m_Extake.stopWheelMotors();
  }
}