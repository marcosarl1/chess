package com.chess.model.chess;

import com.chess.model.boardgame.BoardException;

public class ChessException extends BoardException  {

    public ChessException(String msg){
        super(msg);
    }
}
