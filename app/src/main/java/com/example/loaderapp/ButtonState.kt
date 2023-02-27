package com.example.loaderapp


sealed class ButtonState {
    object Clicked : ButtonState()
    object Loading : ButtonState()
    object Completed : ButtonState()
}