import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public int id;
	public String description;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public String code_of_conduct;
	public String background_image;
	public String end_time;
	public String organizer_name;
	public String location_name;
	public String email;
	public String timezone;
	public String start_time;
	public String topic;
	public String privacy;
	public String logo;
	public String state;
	public String type;

	public RootModel(CreatorModel creator, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String schedule_published_on, int id, String description, String organizer_description, VersionModel version, String name, String code_of_conduct, String background_image, String end_time, String organizer_name, String location_name, String email, String timezone, String start_time, String topic, String privacy, String logo, String state, String type) {

		this._creator = creator;
		this._copyright = copyright;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.description = description;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.email = email;
		this.timezone = timezone;
		this.start_time = start_time;
		this.topic = topic;
		this.privacy = privacy;
		this.logo = logo;
		this.state = state;
		this.type = type;

	}

}