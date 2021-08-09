package com.comin.bowling.maria;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.comin.syp.calculator.Score;

public class ScoreTest {

	private Score score;

	@Before
	public void setUp() {
		score = new Score();
	}

	public void rollMany(int length, int pin) {
		for (int i = 0; i < length; i++) {
			score.roll(pin);
		}
	}

	public void canRoll() {
		score.roll(0);
	}

	public void rollSpare() {
		score.roll(5);
		score.roll(5);
	}

	@Test
	public void gutterGame() {
		score.reset();
		for (int i = 0; i < 20; i++) {
			score.roll(0);
		}

		Integer gutter = score.getscore();

		try {
			assertThat(gutter, is(0));
			System.out.println("gutterGame() Test Success! > Score :  " + gutter);

			assertThat(gutter, is(1)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("gutterGame() Test Fail >  input :  1\n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError 발생하므로 위의 코드 실행
		}
	}

	@Test
	public void allOneGame() {
		score.reset();
		for (int i = 0; i < 20; i++) {
			score.roll(1);
		}

		Integer allOne = score.getscore();

		try {
			assertThat(allOne, is(20));
			System.out.println("allOneGame() Test Success! > Score :  " + allOne);

			assertThat(allOne, is(22)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("allOneGame() Test Fail >  input :  22\n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError 발생하므로 위의 코드 실행
		}
	}

	// gutter, allOne 이 성공했으니까 getScore의 일반 방식에는 문제 X

	@Test
	public void oneStrikeGame() {

		score.reset();
		score.roll(10);
		score.roll(5);
		score.roll(4);

		Integer oneStrike = score.getscore() - 9;
		// score.getscore()은 현재의 점수기때문에, 그 다음 프레임의 합계를 빼주면 전프레임의 점수가 나온다.

		try {
			assertThat(oneStrike, is(19));
			System.out.println("oneStrikeGame() Test Success! > Score :  " + oneStrike);

			assertThat(oneStrike, is(10)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("oneStrikeGame() Test Fail >  input :  10\n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError 발생하므로 위의 코드 실행
		}

	}

	@Test
	public void oneSpareGame() {

		score.reset();
		score.roll(5);
		score.roll(5);
		score.roll(3);

		Integer oneSpare = score.getscore() - 3;

		try {
			assertThat(oneSpare, is(13));
			System.out.println("oneSpareGame() Test Success! > Score :  " + oneSpare);

			assertThat(oneSpare, is(10)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("oneSpareGame() Test Fail >  input :  10\n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError가 발생하므로 위의 코드 실행
		}

	}

	@Test
	public void allSpareGame() {
		score.reset();
		rollMany(21, 5);
		Integer allSpare = score.getscore();

		try {
			assertThat(allSpare, is(150));
			System.out.println("allSpareGame() Test Success! > Score :  " + allSpare);

			assertThat(allSpare, is(105)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("allSpareGame() Test Fail >  input :  105\n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError 발생하므로 위의 코드 실행
		}

	}

	@Test
	public void perfectGame() {
		score.reset();
		rollMany(12, 10);
		Integer perfect = score.getscore();

		try {
			assertThat(perfect, is(300));
			System.out.println("perfectGame() Test Success! > Score :  " + perfect + "");

			assertThat(perfect, is(120)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("perfectGame() Test Fail > input :  120\n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError 발생하므로 위의 코드 실행
		}

	}

	@Test
	public void randomGame() {
		Random rd = new Random();

		score.reset();
		int rd1 = rd.nextInt(10);
		score.roll(rd1);
		int rd2 = rd.nextInt(10);
		score.roll(rd2);

		Integer random = score.getscore();

		try {
			assertThat(random, is(rd1 + rd2));
			System.out.println("randomGame() Test Success! > Score :  " + random + "");

			assertThat(random, is(rd1 + rd2 + 1)); // 테스트를 위해 잘못된 값을 입력
		} catch (AssertionError e) {
			System.out.println("randomGame() Test Fail > \n");
			// 잘못된 값을 입력한 assertThat 구문으로 인해 AssertionError 발생하므로 위의 코드 실행
		}

	}

}
