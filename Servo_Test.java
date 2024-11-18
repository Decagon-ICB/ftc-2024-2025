

            // Calculate Servo Position
            if(!dpad_latch_right && gamepad1.dpad_right && Rack_Pos < 1.0){
                Rack_Pos = Rack_Pos + Rack_inc;
            }
            dpad_latch_right = gamepad1.dpad_right;

            if(!dpad_latch_left && gamepad1.dpad_left && Rack_Pos > 0.0){
                Rack_Pos = Rack_Pos - Rack_inc;
            }
            dpad_latch_left = gamepad1.dpad_left;

            // Set Servo Position
            Rack_Servo.setPosition(Rack_Pos);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Front left/Right", "%4.2f, %4.2f", leftFrontPower, rightFrontPower);
            telemetry.addData("Back  left/Right", "%4.2f, %4.2f", leftBackPower, rightBackPower);
            telemetry.addData("Rack_Pos", "%4.2f", Rack_Pos);
            telemetry.update();
