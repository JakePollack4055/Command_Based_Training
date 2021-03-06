/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class OuttakeHatch extends SequentialCommandGroup {
  /**
   * Creates a new OuttakeHatch.
   */
  public OuttakeHatch(Hatch_Intake_Subsystem, HatchIntakeRollersubsystem(), Hatch_Intake_Subsystem ) { //these need to have names (like any constructor)
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new Prepare_To_Intake(), new Set_Hatch_Rollers(DoubleSupplier -1), new Stow()); //should be ()->{-1} rather than DoubleSupplier, Stow needs to take subsystem as arg



  }
}
