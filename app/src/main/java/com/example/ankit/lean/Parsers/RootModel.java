import java.util.ArrayList;

class RootModel {

	public String email;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String privacy;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String start_time;
	public String location_name;
	public String topic;
	public String logo;
	public String end_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String state;
	public String organizer_description;
	public String timezone;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String email, CreatorModel creator, String description, VersionModel version, String privacy, CopyrightModel copyright, String schedule_published_on, String start_time, String location_name, String topic, String logo, String end_time, String type, Call_for_papersModel call_for_papers, String name, String state, String organizer_description, String timezone, String code_of_conduct, int id, String background_image, String organizer_name, ArrayList<Social_linksModel> social_links) {

		this.email = email;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.privacy = privacy;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.location_name = location_name;
		this.topic = topic;
		this.logo = logo;
		this.end_time = end_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.state = state;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;

	}

}