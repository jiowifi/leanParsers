import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String state;
	public String description;
	public String start_time;
	public String logo;
	public String timezone;
	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public VersionModel _version;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String privacy;
	public String organizer_name;
	public String end_time;
	public int id;
	public String organizer_description;

	public RootModel(CreatorModel creator, String state, String description, String start_time, String logo, String timezone, String schedule_published_on, String email, String code_of_conduct, VersionModel version, String location_name, String name, Call_for_papersModel call_for_papers, String topic, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String type, String background_image, String privacy, String organizer_name, String end_time, int id, String organizer_description) {

		this._creator = creator;
		this.state = state;
		this.description = description;
		this.start_time = start_time;
		this.logo = logo;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.social_links = social_links;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.id = id;
		this.organizer_description = organizer_description;

	}

}