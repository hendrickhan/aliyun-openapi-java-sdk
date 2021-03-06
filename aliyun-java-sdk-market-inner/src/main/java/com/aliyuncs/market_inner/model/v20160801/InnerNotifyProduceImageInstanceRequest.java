/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerNotifyProduceImageInstanceRequest extends RpcAcsRequest<InnerNotifyProduceImageInstanceResponse> {
	
	public InnerNotifyProduceImageInstanceRequest() {
		super("Market-Inner", "2016-08-01", "InnerNotifyProduceImageInstance");
	}

	private String produceMsg;

	public String getProduceMsg() {
		return this.produceMsg;
	}

	public void setProduceMsg(String produceMsg) {
		this.produceMsg = produceMsg;
		if(produceMsg != null){
			putQueryParameter("ProduceMsg", produceMsg);
		}
	}

	@Override
	public Class<InnerNotifyProduceImageInstanceResponse> getResponseClass() {
		return InnerNotifyProduceImageInstanceResponse.class;
	}

}
