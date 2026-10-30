-- Sample SQL data for testing
-- Run this after the application creates tables

INSERT INTO students (name, roll_number, email, maths_marks, physics_marks, chemistry_marks, english_marks, computer_marks, total_marks, percentage, grade, status, created_at, updated_at)
VALUES 
('John Doe', '2024001', 'john.doe@example.com', 85, 90, 88, 92, 87, 442, 88.4, 'A', 'PASS', NOW(), NOW()),
('Jane Smith', '2024002', 'jane.smith@example.com', 92, 88, 95, 90, 93, 458, 91.6, 'A+', 'PASS', NOW(), NOW()),
('Bob Johnson', '2024003', 'bob.johnson@example.com', 78, 75, 80, 77, 79, 389, 77.8, 'B+', 'PASS', NOW(), NOW()),
('Alice Brown', '2024004', 'alice.brown@example.com', 65, 68, 70, 72, 69, 344, 68.8, 'B', 'PASS', NOW(), NOW()),
('Charlie Wilson', '2024005', 'charlie.wilson@example.com', 45, 50, 48, 52, 47, 242, 48.4, 'C', 'PASS', NOW(), NOW());
