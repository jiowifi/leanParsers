import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String privacy;
	public String start_time;
	public String description;
	public String email;
	public CopyrightModel _copyright;
	public String timezone;
	public String topic;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String location_name;
	public String schedule_published_on;
	public String type;
	public String organizer_name;
	public int id;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String logo;
	public String end_time;
	public String background_image;
	public String organizer_description;

	public RootModel(VersionModel version, String privacy, String start_time, String description, String email, CopyrightModel copyright, String timezone, String topic, String name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String location_name, String schedule_published_on, String type, String organizer_name, int id, String code_of_conduct, Call_for_papersModel call_for_papers, String state, String logo, String end_time, String background_image, String organizer_description) {

		this._version = version;
		this.privacy = privacy;
		this.start_time = start_time;
		this.description = description;
		this.email = email;
		this._copyright = copyright;
		this.timezone = timezone;
		this.topic = topic;
		this.name = name;
		this.social_links = social_links;
		this._creator = creator;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_name = organizer_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.logo = logo;
		this.end_time = end_time;
		this.background_image = background_image;
		this.organizer_description = organizer_description;

	}

}