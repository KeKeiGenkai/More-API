import javax.swing.*;
import java.awt.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Создаем новое окно (фрейм)
        JFrame frame = new JFrame("Simple Swing Application");

        // Устанавливаем операцию закрытия окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем новую панель для добавления компонентов
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Устанавливаем размер окна
        frame.setSize(400, 300);

        // Делаем окно видимым
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Устанавливаем менеджер компоновки
        panel.setLayout(null);

        // Создаем метку
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Создаем текстовое поле
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Создаем метку для пароля
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        // Создаем поле для ввода пароля
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // Создаем кнопку
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }
}
