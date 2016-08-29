import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String background_image;
	public String end_time;
	public int id;
	public String organizer_name;
	public CreatorModel _creator;
	public String location_name;
	public String privacy;
	public VersionModel _version;
	public String topic;
	public String email;
	public String organizer_description;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String logo;
	public String name;
	public String start_time;
	public String state;
	public String type;

	public RootModel(String schedule_published_on, String timezone, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String background_image, String end_time, int id, String organizer_name, CreatorModel creator, String location_name, String privacy, VersionModel version, String topic, String email, String organizer_description, String description, Call_for_papersModel call_for_papers, String code_of_conduct, String logo, String name, String start_time, String state, String type) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.social_links = social_links;
		this._copyright = copyright;
		this.background_image = background_image;
		this.end_time = end_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.location_name = location_name;
		this.privacy = privacy;
		this._version = version;
		this.topic = topic;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.name = name;
		this.start_time = start_time;
		this.state = state;
		this.type = type;

	}

}