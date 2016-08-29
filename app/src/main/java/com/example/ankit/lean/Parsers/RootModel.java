import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String logo;
	public String schedule_published_on;
	public String topic;
	public String end_time;
	public String privacy;
	public String background_image;
	public String type;
	public String email;

	public RootModel(String name, String location_name, String description, String timezone, Call_for_papersModel call_for_papers, String organizer_description, ArrayList<Social_linksModel> social_links, String state, int id, String code_of_conduct, String start_time, CreatorModel creator, String organizer_name, CopyrightModel copyright, VersionModel version, String logo, String schedule_published_on, String topic, String end_time, String privacy, String background_image, String type, String email) {

		this.name = name;
		this.location_name = location_name;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.state = state;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._version = version;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.end_time = end_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.type = type;
		this.email = email;

	}

}