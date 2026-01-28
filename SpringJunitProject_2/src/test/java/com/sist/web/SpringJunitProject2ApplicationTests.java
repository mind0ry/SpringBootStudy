package com.sist.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sist.web.service.MailService;

import jakarta.mail.MessagingException;


@SpringBootTest
class SpringJunitProject2ApplicationTests {

	@Autowired
	private MailService mService;
	
	/*
	 * @Test public void mailTextSend() {
	 * mService.sendTextMail("alstjrasd@naver.com", "안녕하세요", "메일 전송 히히"); }
	 */
	@Test
	public void mailHtmlSend() throws MessagingException {
		String html="""
						<html>
							<body>
								<h2>회원 가입을 축하합니다</h2>
								<img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAyMDVfMTc1%2FMDAxNzM4NzIxOTUzNDQz.XzX_oXv-dVYwS4r0CtQ-2Qjv0bhxSPteR8SBpwssRXcg.PPXfWsNfFzHZmZAeCDvnECdezA8DWK7rFKGie5OUgZ8g.JPEG%2F01_%252815%2529.jpg&type=sc960_832">
								<a href="/">클릭</a>
							</body>
						</html>
					""";
		
		mService.sendHtmlMail("alstjrasd@naver.com", "메일", html);
	}
	
	//@Test
	//void contextLoads() {
	//}

}
