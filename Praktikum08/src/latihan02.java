import java.awt.*;
import java.awt.event.*;

public class latihan02 extends Frame implements MouseListener {

  // Declare variables and objects here
  char turn = 'X';  // 'X' goes first
  char[][] board = new char[3][3];  // 3x3 board

  public latihan02() {
    // Set up the frame and panel here
    addMouseListener(this);
  }

  public void mouseClicked(MouseEvent e) {
    // Get the mouse coordinates
    int x = e.getX();
    int y = e.getY();

    // Determine which area was clicked
    int row = y / 100;
    int col = x / 100;

    // Place a symbol on the board
    if (board[row][col] == 0) {
      board[row][col] = turn;

      // Switch turns
      if (turn == 'X') {
        turn = 'O';
      } else {
        turn = 'X';
      }
    }

    // Redraw the board
    repaint();
  }

  public void paint(Graphics g) {
    // Draw the board and symbols here
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        int x = j * 100;
        int y = i * 100;
        g.drawRect(x, y, 100, 100);  // Draw a rectangle for each area
        if (board[i][j] != 0) {
          g.drawString(board[i][j] + "", x + 50, y + 50);  // Draw the symbol in the center of the rectangle
        }
      }
    }
  }

  public static void main(String[] args) {
    // Create and show the Tic Tac Toe frame
	latihan02 game = new latihan02();
    game.setTitle("Tic Tac Toe");
    game.setSize(300, 300);
    game.setVisible(true);
  }

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}