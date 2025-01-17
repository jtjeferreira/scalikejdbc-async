/*
 * Copyright 2013 Kazuhiro Sera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package scalikejdbc.async

import java.nio.charset.Charset

import com.github.jasync.sql.db.SSLConfiguration
import io.netty.buffer.ByteBufAllocator

import scala.concurrent.duration.Duration

/**
 * Settings for AsyncConnectionPool
 */
case class AsyncConnectionPoolSettings(
  maxPoolSize: Int = 8,
  maxQueueSize: Int = 8,
  maxIdleMillis: Long = 1000L,
  connectionSettings: AsyncConnectionSettings = AsyncConnectionSettings()
)

case class AsyncConnectionSettings(
  ssl: Option[SSLConfiguration] = None,
  charset: Option[Charset] = None,
  maximumMessageSize: Option[Int] = None,
  allocator: Option[ByteBufAllocator] = None,
  connectTimeout: Option[Duration] = None,
  testTimeout: Option[Duration] = None,
  queryTimeout: Option[Duration] = None
)
