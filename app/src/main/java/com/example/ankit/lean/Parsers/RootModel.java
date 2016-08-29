import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String organizer_description;
	public String name;
	public String end_time;
	public int id;
	public String logo;
	public String privacy;
	public String email;
	public String location_name;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_name;
	public String timezone;
	public String schedule_published_on;
	public String topic;
	public String state;
	public CopyrightModel _copyright;

	public RootModel(Call_for_papersModel call_for_papers, String background_image, String organizer_description, String name, String end_time, int id, String logo, String privacy, String email, String location_name, String description, VersionModel version, String code_of_conduct, String start_time, CreatorModel creator, ArrayList<Social_linksModel> social_links, String type, String organizer_name, String timezone, String schedule_published_on, String topic, String state, CopyrightModel copyright) {

		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.name = name;
		this.end_time = end_time;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this.email = email;
		this.location_name = location_name;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.social_links = social_links;
		this.type = type;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.state = state;
		this._copyright = copyright;

	}

}