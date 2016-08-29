import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_name;
	public CreatorModel _creator;
	public String organizer_description;
	public String end_time;
	public String logo;
	public String schedule_published_on;
	public String topic;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String description;
	public String state;
	public String email;
	public int id;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String name;
	public String location_name;
	public VersionModel _version;
	public String timezone;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String privacy, String organizer_name, CreatorModel creator, String organizer_description, String end_time, String logo, String schedule_published_on, String topic, String code_of_conduct, CopyrightModel copyright, String description, String state, String email, int id, String background_image, Call_for_papersModel call_for_papers, String type, String name, String location_name, VersionModel version, String timezone, String start_time, ArrayList<Social_linksModel> social_links) {

		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.description = description;
		this.state = state;
		this.email = email;
		this.id = id;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.name = name;
		this.location_name = location_name;
		this._version = version;
		this.timezone = timezone;
		this.start_time = start_time;
		this.social_links = social_links;

	}

}