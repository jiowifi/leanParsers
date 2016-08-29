import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public String logo;
	public CreatorModel _creator;
	public String email;
	public String location_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String state;
	public String name;
	public VersionModel _version;
	public String topic;
	public String timezone;
	public String privacy;

	public RootModel(Call_for_papersModel call_for_papers, String type, String description, String start_time, int id, ArrayList<Social_linksModel> social_links, String background_image, String end_time, String organizer_description, String logo, CreatorModel creator, String email, String location_name, String code_of_conduct, String schedule_published_on, CopyrightModel copyright, String organizer_name, String state, String name, VersionModel version, String topic, String timezone, String privacy) {

		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._creator = creator;
		this.email = email;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this._version = version;
		this.topic = topic;
		this.timezone = timezone;
		this.privacy = privacy;

	}

}