// See LICENSE.txt for license details.
package datapath

import chisel3.iotesters.{Driver, TesterOptionsManager}
import utils.TutorialRunner

object Launcher {
  val examples = Map(
      "AluControl" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new AluControl(), manager) {
          (c) => new AluControlTests(c)
        }
      },
      "Alu" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new Alu(), manager) {
          (c) => new AluTests(c)
        }
      },
      "AluCirc" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new AluCirc(), manager) {
          (c) => new AluCircTests(c)
        }
      },
      "InstructionTypeDecode" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new InstructionTypeDecode(), manager) {
          (c) => new InstructionTypeDecodeTests(c)
        }
      },
      "ControlDecode" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new ControlDecode(), manager) {
          (c) => new ControlDecodeTests(c)
        }
      },
      "Control" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new Control(), manager) {
          (c) => new ControlTests(c)
        }
      },
      "ImmediateGeneration" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new ImmediateGeneration(), manager) {
          (c) => new ImmediateGenerationTests(c)
        }
      },
      "RegisterFile" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new RegisterFile(), manager) {
          (c) => new RegisterFileTests(c)
        }
      },
      "Top" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new Top(), manager) {
          (c) => new TopTests(c)
        }
      },
      "Pc" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new Pc(), manager) {
          (c) => new PcTests(c)
        }
      },
      "InstructionMem" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new InstructionMem(), manager) {
          (c) => new InstructionMemTests(c)
        }
      },
      "Jalr" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new Jalr(), manager) {
          (c) => new JalrTests(c)
        }
      },
      "DataMem" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new DataMem(), manager) {
          (c) => new DataMemTests(c)
        }
      }
  )
  def main(args: Array[String]): Unit = {
    TutorialRunner("examples", examples, args)
  }
}

