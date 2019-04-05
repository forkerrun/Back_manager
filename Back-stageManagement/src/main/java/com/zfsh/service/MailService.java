package com.zfsh.service;

import java.util.List;

import com.zfsh.model.Mail;

public interface MailService {

	void save(Mail mail, List<String> toUser);
}
