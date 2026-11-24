package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.extake.Extake;

public class ExtakeCommand extends Command {

  private final Extake m_Extake;

  public ExtakeCommand(Extake extakeWheels) {

    m_Extake = extakeWheels;
    addRequirements(m_Extake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_Extake.setWheelMotors(0.3);
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