package org.firstinspires.ftc.teamcode; 
import com.qualcomm.robotcore.hardware.DcMotor; 
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; 
import com.qualcomm.robotcore.eventloop.opmode.Autonomous; 
@Autonomous(name="Figure8 Real Robot", group="Autonomous") 
public class Figure8RealRobot extends LinearOpMode { 
    // 4 Motor Declarations matching your configuration names 
    DcMotor left_back; 
    DcMotor right_back; 
    DcMotor left_front; 
    DcMotor right_front; 
    @Override public void runOpMode() { 
        // --- 1. HARDWARE MAPPING --- 
        left_back = hardwareMap.get(DcMotor.class, "left_back"); 
        right_back = hardwareMap.get(DcMotor.class, "right_back"); 
        left_front = hardwareMap.get(DcMotor.class, "left_front"); 
        right_front = hardwareMap.get(DcMotor.class, "right_front"); 
        // Set motor directions (Reverse left side so positive power moves forward) 
        left_back.setDirection(DcMotor.Direction.FORWARD); 
        left_front.setDirection(DcMotor.Direction.FORWARD); 
        right_back.setDirection(DcMotor.Direction.REVERSE); 
        right_front.setDirection(DcMotor.Direction.REVERSE); 
        telemetry.addData("Status", "Initialized. Ready to Run."); 
        telemetry.update(); 
        // Wait for the Driver Station play button to be pressed 
        waitForStart(); 
        // --- 2. RUN SEQUENCE (Your exact timing logic) --- 
        if (opModeIsActive()) { 
            setDrivePower(0.4, 0.6); 
            sleep(700); 
            setDrivePower(0, 0.5); 
            sleep(1000); 
            setDrivePower(0.5, 0.5); 
            sleep(700); 
            setDrivePower(0.4, 0); 
            sleep(1000); 
            setDrivePower(0.4, 0); 
            sleep(1000); 
            setDrivePower(0.5, 0.5); 
            sleep(700); 
            setDrivePower(0.5, 0); 
            sleep(1000); 
            setDrivePower(0.5, 0); 
            sleep(1000); 
            setDrivePower(0.5, 0.40); 
            sleep(2700); // Stop all motors at the end 
            setDrivePower(0, 0); 
            
        } 
        
    } 
    // Helper method to control left and right sides across your 4 motors 
    private void setDrivePower(double leftPower, double rightPower) { 
        left_back.setPower(leftPower); 
        left_front.setPower(leftPower); 
        right_back.setPower(rightPower); 
        right_front.setPower(rightPower); 
        
    }
}  
