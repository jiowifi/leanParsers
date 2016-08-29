import java.util.ArrayList;

class RootModel {

	public String state;
	public CreatorModel _creator;
	public String privacy;
	public String end_time;
	public VersionModel _version;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String organizer_description;
	public String organizer_name;
	public String email;
	public String background_image;
	public CopyrightModel _copyright;
	public String logo;
	public int id;
	public String start_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;
	public String type;
	public String timezone;
	public String description;

	public RootModel(String state, CreatorModel creator, String privacy, String end_time, VersionModel version, String code_of_conduct, Call_for_papersModel call_for_papers, String schedule_published_on, String organizer_description, String organizer_name, String email, String background_image, CopyrightModel copyright, String logo, int id, String start_time, String name, ArrayList<Social_linksModel> social_links, String location_name, String topic, String type, String timezone, String description) {

		this.state = state;
		this._creator = creator;
		this.privacy = privacy;
		this.end_time = end_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.email = email;
		this.background_image = background_image;
		this._copyright = copyright;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this.name = name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;
		this.type = type;
		this.timezone = timezone;
		this.description = description;

	}

}