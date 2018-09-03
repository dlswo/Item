package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ItemService {

	ItemVO[] itemVOS;
	int idx;

	public ItemService(String[] arr){
		this.itemVOS = new ItemVO[arr.length];
		for (int i = 0; i < arr.length; i++){
			itemVOS[i] = new ItemVO(arr[i]);
		}
	}

	public ItemService(ItemVO[] itemVOS) {
		this.itemVOS = itemVOS;
		this.idx = 0;
	}

	public void shuffle() {
		Collections.shuffle(Arrays.asList(itemVOS));
	}


	public ItemVO selectOne() {

		ItemVO result = this.itemVOS[idx];

		idx++;

		return result;
	}
}