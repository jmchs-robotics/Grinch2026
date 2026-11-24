package frc.robot.subsystems.shooter;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.ExtakeCommands;
import frc.robot.Constants.extakeConstants;

//Neo Vortex motor

public class Extake extends SubsystemBase {
    
 private final SparkFlex extakeMotor;

  public Extake() {

    extakeMotor = new SparkFlex(extakeConstants.motorID, MotorType.kBrushless);

  }

  public void stopWheelMotors() {
    extakeMotor.stopMotor();
  }

  public void setWheelMotors(double speed) {
    extakeMotor.set(speed);
  }
    
}
