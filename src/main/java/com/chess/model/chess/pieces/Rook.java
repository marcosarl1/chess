package com.chess.model.chess.pieces;

import com.chess.model.boardgame.Board;
import com.chess.model.chess.ChessPiece;
import com.chess.model.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
