package org.firstinspires.ftc.teamcode.libs;

import com.qualcomm.robotcore.hardware.Gamepad;

public class OperatorInterface {
    public Gamepad gamepad1;
    public Gamepad gamepad2;
    
    public OperatorInterface(Gamepad gp1, Gamepad gp2) {
        gamepad1 = gp1;
        gamepad2 = gp2;
    }
    
    
    public float getDriveVertical() {
        return gamepad1.left_stick_y + gamepad2.left_stick_y;
    }
    
    public float getDriveHorizontal() {
        return gamepad1.left_stick_x + gamepad2.left_stick_x;
    }
    
    public float getDriveRotational() {
        return gamepad1.right_stick_x + gamepad2.right_stick_x;
    }
    
    public float getDriveSpeed() {
//        return (gamepad1.left_bumper || gamepad2.left_bumper) ? 0.3f : 1f;
        return 1.0f;
    }

    public boolean shootOne() {
        return gamepad1.left_bumper || gamepad2.left_bumper;
    }
    
    public boolean intakeForward() {
        return (gamepad1.right_trigger > 0) || (gamepad2.right_trigger > 0);
    }
    
    public boolean intakeBackward() {
        return gamepad1.right_bumper || gamepad2.right_bumper;
    }
    
    public boolean shooterPowerHigher() {
        //return gamepad1.y || gamepad2.y;
        return false;
    }
    
    public boolean shooterPowerLower() {
        return gamepad1.x || gamepad2.x;
    }
    
    public boolean shooterSpin() {
        return (gamepad1.left_trigger > 0) || (gamepad2.left_trigger > 0);
    }
    
    public boolean wobbleGoalUp() {
        return gamepad1.dpad_up || gamepad2.dpad_up;
    }
    
    public boolean wobbleGoalMiddle() {
        return gamepad1.dpad_right || gamepad2.dpad_right;
    }
    
    public boolean wobbleGoalDown() {
        return gamepad1.dpad_down || gamepad2.dpad_down;
    }
    
    public boolean wobbleGoalChange() {
        return wobbleGoalUp() || wobbleGoalMiddle() || wobbleGoalDown() || wobbleGrab() || wobbleRelease();
    }
    
    public boolean wobbleGrab() {
        return gamepad1.a || gamepad2.a;
    }
    
    public boolean wobbleRelease() {
        return gamepad1.b || gamepad2.b;
    }
    
    public boolean powerShots() {
        return gamepad1.back || gamepad2.back;
    }
    
    public boolean cancelPowerShots() {
        return gamepad1.y || gamepad2.y;
    }
}
