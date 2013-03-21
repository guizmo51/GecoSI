/**
 * Copyright (c) 2013 Simon Denier
 */
package net.gecosi;

import java.io.IOException;
import java.util.TooManyListenersException;

/**
 * @author Simon Denier
 * @since Mar 14, 2013
 *
 */
public interface SiPort {

	public SiPort initReader(SiMessageQueue messageQueue) throws TooManyListenersException, IOException;

	public CommWriter getWriter() throws IOException;

}