package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Conveyor;


public class ConveyorBackward extends CommandBase {
    Conveyor conveyor;
    public ConveyorBackward(Conveyor conveyor) {
        this.conveyor = conveyor;
    }
    @Override
    public void initialize(){
        conveyor.motorReverse();
    }
    
    @Override
    public void end(boolean interrupted){
        conveyor.motorOff();
    }
}