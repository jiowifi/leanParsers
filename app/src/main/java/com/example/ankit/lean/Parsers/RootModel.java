import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String location_name;
	public String schedule_published_on;
	public String logo;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public String background_image;
	public String description;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public String privacy;
	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String type;

	public RootModel(String start_time, String location_name, String schedule_published_on, String logo, String topic, ArrayList<Social_linksModel> social_links, String organizer_name, Call_for_papersModel call_for_papers, String email, int id, String code_of_conduct, String name, VersionModel version, String background_image, String description, CreatorModel creator, String state, String end_time, String privacy, String timezone, String organizer_description, CopyrightModel copyright, String type) {

		this.start_time = start_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this.background_image = background_image;
		this.description = description;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.type = type;

	}

}