package com.leetcode.patterns;

public class PatternsExecutor {

    public static void main(String[] args) {
        AllStar allStar = new AllStar();
        allStar.print(5);

        IPlus1Star iPlus1Star = new IPlus1Star();
        iPlus1Star.print(5);

        IPlus1Number iPlus1Number = new IPlus1Number();
        iPlus1Number.print(5);

        IPlus1SameNumber iPlus1SameNumber = new IPlus1SameNumber();
        iPlus1SameNumber.print(5);

        ReverseTriangle reverseTriangle = new ReverseTriangle();
        reverseTriangle.print(5);

        ReverseNumberTriangle numberTriangle = new ReverseNumberTriangle();
        numberTriangle.print(5);

        NStarTriangle nst = new NStarTriangle();
        nst.print(5);

        NStarTriangeReverse nStarTriangeReverse = new NStarTriangeReverse();
        nStarTriangeReverse.print(5);

        CompleteTriangle completeTriangle = new CompleteTriangle();
        completeTriangle.print(5);

        BinaryNumberTriangle binaryNumberTriangle = new BinaryNumberTriangle();

        binaryNumberTriangle.print(6);
        binaryNumberTriangle.printUsingFlipLogic(6);

        NumberCrown crown = new NumberCrown();
        crown.print(7);

        NumberTriangle nt = new NumberTriangle();
        nt.print(7);

        IncreasingLetterTriangle inc = new IncreasingLetterTriangle();
        inc.print(7);

        ReverseLetterTriangle rv = new ReverseLetterTriangle();
        rv.print(7);

        AlphaRamp ar = new AlphaRamp();
        ar.print(3);

        AlphaHill ah = new AlphaHill();
        ah.print(3);

        AlphaTriangle at = new AlphaTriangle();
        at.print(5);

        AlphaRampReverse arr = new AlphaRampReverse();
        arr.print(5);

        Symmetry syn = new Symmetry();
        syn.print(10);

        SamSymmetry samSymmetry = new SamSymmetry();
        samSymmetry.print(3);
        samSymmetry.print2(3);

        StarSquare square = new StarSquare();
        square.print(8);

        DistanceFromCenterNumbers centerNumbers = new DistanceFromCenterNumbers();
        centerNumbers.print(5);
    }
}
