import java.util.ArrayList;

class RootModel {

	public String description;
	public String name;
	public CreatorModel _creator;
	public String logo;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public String topic;
	public String background_image;
	public String code_of_conduct;
	public VersionModel _version;
	public String state;
	public String timezone;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public int id;
	public CopyrightModel _copyright;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String end_time;
	public String start_time;

	public RootModel(String description, String name, CreatorModel creator, String logo, String organizer_description, String schedule_published_on, String email, String topic, String background_image, String code_of_conduct, VersionModel version, String state, String timezone, String location_name, Call_for_papersModel call_for_papers, String type, int id, CopyrightModel copyright, String privacy, ArrayList<Social_linksModel> social_links, String organizer_name, String end_time, String start_time) {

		this.description = description;
		this.name = name;
		this._creator = creator;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.topic = topic;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.state = state;
		this.timezone = timezone;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.id = id;
		this._copyright = copyright;
		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.start_time = start_time;

	}

}