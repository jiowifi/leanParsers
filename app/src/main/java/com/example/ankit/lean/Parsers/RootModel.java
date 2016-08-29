import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String logo;
	public String organizer_description;
	public String type;
	public String topic;
	public String privacy;
	public String start_time;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public String end_time;
	public String timezone;
	public CopyrightModel _copyright;
	public int id;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String state;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String description;

	public RootModel(String background_image, String logo, String organizer_description, String type, String topic, String privacy, String start_time, String organizer_name, String name, VersionModel version, String end_time, String timezone, CopyrightModel copyright, int id, String schedule_published_on, CreatorModel creator, String location_name, Call_for_papersModel call_for_papers, String code_of_conduct, String state, String email, ArrayList<Social_linksModel> social_links, String description) {

		this.background_image = background_image;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.type = type;
		this.topic = topic;
		this.privacy = privacy;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this.end_time = end_time;
		this.timezone = timezone;
		this._copyright = copyright;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.email = email;
		this.social_links = social_links;
		this.description = description;

	}

}