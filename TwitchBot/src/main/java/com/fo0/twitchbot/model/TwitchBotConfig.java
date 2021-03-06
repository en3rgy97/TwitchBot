package com.fo0.twitchbot.model;

import java.io.Serializable;

import org.apache.commons.lang3.RandomStringUtils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TwitchBotConfig implements Serializable {

	private static final long serialVersionUID = -8112274245398450002L;

	@Builder.Default
	private String id = RandomStringUtils.randomAlphabetic(10);

	private String name;
	private String channel;
	private String oauth;

	@Builder.Default
	private boolean autostart = true;

	@Builder.Default
	private boolean allowChatCommands = true;

}
