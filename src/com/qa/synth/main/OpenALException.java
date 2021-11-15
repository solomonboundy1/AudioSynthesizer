package com.qa.synth.main;

import static org.lwjgl.openal.AL10.*;

public class OpenALException extends RuntimeException {
	
	OpenALException(int errorCode) {
		
		super("Internal " + (errorCode == AL_INVALID_NAME ? "Invalid name" : errorCode == AL_INVALID_ENUM ? "invalud enum" : errorCode == AL_INVALID_VALUE
				? "invalid value" : errorCode == AL_INVALID_OPERATION ? "invalid operation" : "unknown") + " OpenAL exception.");
	}

}
