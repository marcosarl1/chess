package com.chess;

import com.chess.model.chess.ChessMatch;
import com.chess.view.UI;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}