final: used on attributes makes them constants
but using it on Methods and Classes??

Example:
    Father Class - Figure:
        Attributes: Size:double
    Children Class - ClosedFigure and OpenFigure:
        OpenFigure:
            Attributes: -----
        ClosedFigure: (Father Class for Square)
            Attributes: nSides:int
            Method:     draw(): void
            Square: (Children Class for ClosedFigure)
                Attributes: Area:double
                Method:     draw(): void
// Final help us to not have more children Classes, so if we add Final to ClosedFigure, the Class Square could not be inherited

// Final in case of Method, help us to have a UNIQUE METHOD NAME that could not be used by the Children Classes, like 'draw()' on ClosedFigure and on Square
// so having final on Method 'draw()' of ClosedFigure will make that Square could not have the same name for it's methods