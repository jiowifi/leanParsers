import java.util.ArrayList;

class RootModel {

	public String email;
	public String logo;
	public String code_of_conduct;
	public String schedule_published_on;
	public String organizer_description;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public int id;
	public String description;
	public CopyrightModel _copyright;
	public String name;
	public String privacy;
	public String location_name;
	public String end_time;
	public String type;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CreatorModel _creator;

	public RootModel(String email, String logo, String code_of_conduct, String schedule_published_on, String organizer_description, String start_time, String timezone, String organizer_name, int id, String description, CopyrightModel copyright, String name, String privacy, String location_name, String end_time, String type, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, String topic, Call_for_papersModel call_for_papers, String state, CreatorModel creator) {

		this.email = email;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.id = id;
		this.description = description;
		this._copyright = copyright;
		this.name = name;
		this.privacy = privacy;
		this.location_name = location_name;
		this.end_time = end_time;
		this.type = type;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._creator = creator;

	}

}