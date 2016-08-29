import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String topic;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String state;
	public String organizer_description;
	public String description;
	public CreatorModel _creator;
	public String organizer_name;
	public String email;
	public String background_image;
	public String end_time;
	public String timezone;
	public int id;
	public String privacy;
	public String location_name;
	public String code_of_conduct;
	public String logo;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;

	public RootModel(String start_time, String topic, String name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String type, String state, String organizer_description, String description, CreatorModel creator, String organizer_name, String email, String background_image, String end_time, String timezone, int id, String privacy, String location_name, String code_of_conduct, String logo, VersionModel version, CopyrightModel copyright, String schedule_published_on) {

		this.start_time = start_time;
		this.topic = topic;
		this.name = name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.state = state;
		this.organizer_description = organizer_description;
		this.description = description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.email = email;
		this.background_image = background_image;
		this.end_time = end_time;
		this.timezone = timezone;
		this.id = id;
		this.privacy = privacy;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;

	}

}